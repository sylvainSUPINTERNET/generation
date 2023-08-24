package com.example.cddd.services;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.GroupLayout.Alignment;

import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.example.cddd.dto.PartNumberResponseDto;
import com.example.cddd.dto.UpstreamRequestDto;
import com.example.cddd.dto.UpstreamResponseBomUsagesDto;
import com.example.cddd.dto.UpstreamResponseDto;
import com.example.cddd.dto.UpstreamResponseExtraInfoFromEnoviaBOMUsageDto;
import com.example.cddd.dto.UpstreamResponseExtraInfoFromEnoviaPartDto;
import com.example.cddd.dto.UpstreamResponseExtraInfoFromEnoviaVOMDto;
import com.example.cddd.dto.UpstreamResponsePartNumberDto;

@Service
public class ExcelService {
    
    public ExcelService () { }



    public FileOutputStream writeExcelClean() {

        Workbook wb = init();

        UpstreamResponseDto mock = new UpstreamResponseDto();
        mock.setReqId("123");
        mock.setLocalSystem("CODEP");
        mock.setStatus("SUCCESS");
        mock.setErrorMessageList(new ArrayList<>());

        // part number list
        List<UpstreamResponsePartNumberDto> partNumberList = new ArrayList<>();
        UpstreamResponsePartNumberDto partNumber1 = new UpstreamResponsePartNumberDto();
        UpstreamResponsePartNumberDto partNumber2 = new UpstreamResponsePartNumberDto();

        partNumber1.setPartNumber("1938483");
        partNumber1.setBomSystem("CODEP");
        partNumber1.setLocalPrimaryDesignation("primary 1938483");
        partNumber1.setLocalSecondaryDesignation("primary 1938483");
        partNumber1.setMappedEbomPartNumber("60287373C");
        partNumber1.setMappedCodepPartNumber("XDJEJ1");
        partNumber1.setMappedEnoviaPartNumber("XKEAI19");
        partNumber1.setSystemCreator("CODEP");
        partNumber1.setVehicleMappingCodepWithEbom("6370,VF");
        partNumber1.setVehicleMappingCodepWithEnovia("6370,J4Uxx");
        partNumber1.setGcbFlapFromCodep(true);

        partNumber2.setPartNumber("1938483XKEKE");
        partNumber2.setBomSystem("CODEP");
        partNumber2.setLocalPrimaryDesignation("primary 1938483");
        partNumber2.setLocalSecondaryDesignation("primary 1938483XKEKE");
        partNumber2.setMappedEbomPartNumber("XEAZEAEA");
        partNumber2.setMappedCodepPartNumber("RRRRRR");
        partNumber2.setMappedEnoviaPartNumber("AAAAAAA");
        partNumber2.setSystemCreator("CODEP");
        partNumber2.setVehicleMappingCodepWithEbom("6370,VF");
        partNumber2.setVehicleMappingCodepWithEnovia("6370,J4Uxx");
        partNumber2.setGcbFlapFromCodep(true);

        // extra info enovia
        UpstreamResponseExtraInfoFromEnoviaPartDto extraInfoFromEnoviaPartDto = new UpstreamResponseExtraInfoFromEnoviaPartDto();
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaIndexPsa("00");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaPartType("TYPE");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaPartName("A-xxxxxx");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaPartRevision("1");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaDecPSA("DECPSA");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaProductNature("NATURE");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaLaunchProjectName("project name");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaPreaFromPdef("A-00005561-00 19861157580 00");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaPdefFromPrea("B-00002932919 (3) 	9851416280 02B-00003331120 (2) 	9811223380 02");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaPdefBomAssembly("true");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaPdefBomAssembly("true");
        partNumber1.setExtraInfoFromEnoviaPartDto(extraInfoFromEnoviaPartDto);

        UpstreamResponseExtraInfoFromEnoviaPartDto extraInfoFromEnoviaPartDto2 = new UpstreamResponseExtraInfoFromEnoviaPartDto();
        extraInfoFromEnoviaPartDto2.setExtraInfoFromEnoviaIndexPsa("01");
        extraInfoFromEnoviaPartDto2.setExtraInfoFromEnoviaPartType("Mecanique");
        extraInfoFromEnoviaPartDto2.setExtraInfoFromEnoviaPartName("B-xxxxxx");
        extraInfoFromEnoviaPartDto2.setExtraInfoFromEnoviaPartRevision("1");
        extraInfoFromEnoviaPartDto2.setExtraInfoFromEnoviaDecPSA("DECPSA");
        extraInfoFromEnoviaPartDto2.setExtraInfoFromEnoviaProductNature("NATUREX");
        extraInfoFromEnoviaPartDto2.setExtraInfoFromEnoviaLaunchProjectName("project name CB");
        extraInfoFromEnoviaPartDto2.setExtraInfoFromEnoviaPreaFromPdef("A-0111 00");
        extraInfoFromEnoviaPartDto2.setExtraInfoFromEnoviaPdefFromPrea("YYYYYYY 9811223380 02");
        extraInfoFromEnoviaPartDto2.setExtraInfoFromEnoviaPdefBomAssembly("true");
        extraInfoFromEnoviaPartDto2.setExtraInfoFromEnoviaPdefBomAssembly("true");
        partNumber2.setExtraInfoFromEnoviaPartDto(extraInfoFromEnoviaPartDto2);

        // bom usages list
        List<UpstreamResponseBomUsagesDto> bomUsages = new ArrayList<>();
        UpstreamResponseBomUsagesDto bomUsage1 = new UpstreamResponseBomUsagesDto();
        UpstreamResponseBomUsagesDto bomUsage2 = new UpstreamResponseBomUsagesDto();

        bomUsage1.setCode("BOM1-AOC");
        bomUsage1.setDescription("BOM USAGE 1 DESCRIPTION");

        bomUsage2.setCode("BOM2-A");
        bomUsage2.setDescription("BOM USAGE 1 DESCRIPTION");

        UpstreamResponseExtraInfoFromEnoviaBOMUsageDto extraInfoFromEnoviaBOMUsageDto = new UpstreamResponseExtraInfoFromEnoviaBOMUsageDto();
        extraInfoFromEnoviaBOMUsageDto.setExtraInfoFromEnoviaProductLineName("BOM1 LINE");
        extraInfoFromEnoviaBOMUsageDto.setExtraInfoFromEnoviaBOC("BOM1 BOC");

        UpstreamResponseExtraInfoFromEnoviaBOMUsageDto extraInfoFromEnoviaBOMUsageDto2 = new UpstreamResponseExtraInfoFromEnoviaBOMUsageDto();
        extraInfoFromEnoviaBOMUsageDto2.setExtraInfoFromEnoviaProductLineName("BO2 LINE");
        extraInfoFromEnoviaBOMUsageDto2.setExtraInfoFromEnoviaBOC("BOM2 BOC");

        //vom 
        List<UpstreamResponseExtraInfoFromEnoviaVOMDto> vomList = new ArrayList<>();
        UpstreamResponseExtraInfoFromEnoviaVOMDto vom1 = new UpstreamResponseExtraInfoFromEnoviaVOMDto();
        vom1.setExtraInfoFromEnoviaVOMDescription("VOM1 DESC");
        vom1.setExtraInfoFromEnoviaVOMName("VOM1 NAME");
        vom1.setExtraInfoFromEnoviaVOMPlantName("VOM1 PLANT NAME");
        UpstreamResponseExtraInfoFromEnoviaVOMDto vom2 = new UpstreamResponseExtraInfoFromEnoviaVOMDto();
        vom2.setExtraInfoFromEnoviaVOMDescription("VOM2 DESC");
        vom2.setExtraInfoFromEnoviaVOMName("VOM2 NAME");
        vom2.setExtraInfoFromEnoviaVOMPlantName("VOM2 PLANT NAME");
        vomList.add(vom1);
        vomList.add(vom2);
        extraInfoFromEnoviaBOMUsageDto.setExtraInfoFromEnoviaVOMList(vomList);
        extraInfoFromEnoviaBOMUsageDto2.setExtraInfoFromEnoviaVOMList(vomList);

        bomUsage1.setExtraInfoFromEnoviaBOMUsage(extraInfoFromEnoviaBOMUsageDto);
        bomUsage2.setExtraInfoFromEnoviaBOMUsage(extraInfoFromEnoviaBOMUsageDto2); // NO VOM 

        bomUsages.add(bomUsage1);
        bomUsages.add(bomUsage2);

        partNumber1.setBomUsages(bomUsages);

        partNumber2.setBomUsages(bomUsages);

        partNumberList.add(partNumber1);
        partNumberList.add(partNumber2);
        mock.setPartNumberList(partNumberList);

        wb = writeSheet3CleanEz(wb, mock);

        return saveWorkbook(wb, "C:\\Workspace\\cddd\\generated.xlsx");
        // return saveWorkbook(wb, "E:\\Workspace\\generation\\generated.xlsx");
    }


    private Workbook writeSheet3CleanEz(Workbook wb, UpstreamResponseDto upstreamResponseDto) {
        Sheet sheet = wb.getSheet("sheet3");
        List<Integer> partNumberColumns = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> bomUsageColumns = Arrays.asList(11,12,13,14);
        List<Integer> extraMergeColumns = Arrays.asList(18, 19, 20, 21); // part of partNumber but are placed at the end

        Integer columnKIndex = 10; // column K is static and must be empty

        // Template reserved 2 first rows for header stuff so start at 2 ( index 0 ) instead of 0
        int currentRow = 2; // start at row 3
    
        for (UpstreamResponsePartNumberDto partNumber : upstreamResponseDto.getPartNumberList()) {
            
            int partNumberStartRow = currentRow; 
    
            Row row = sheet.createRow(currentRow);
            for (int column : partNumberColumns) {
                row.createCell(column);
            }
            
            row.getCell(0).setCellValue(partNumber != null ? partNumber.getPartNumber() : "");
            row.getCell(1).setCellValue(partNumber != null && partNumber.getExtraInfoFromEnoviaPartDto() != null ? partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaIndexPsa() : "");
            row.getCell(2).setCellValue(partNumber != null ? partNumber.getSystemCreator() : "");
            row.getCell(3).setCellValue(partNumber != null ? partNumber.getLocalPrimaryDesignation() : "");
            row.getCell(4).setCellValue(partNumber != null ? partNumber.getLocalSecondaryDesignation() : "");
            row.getCell(5).setCellValue(partNumber != null && partNumber.getExtraInfoFromEnoviaPartDto() != null ? partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPartType() : "");
            row.getCell(6).setCellValue(partNumber != null && partNumber.getExtraInfoFromEnoviaPartDto() != null ? partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPartName() : "");
            row.getCell(7).setCellValue(partNumber != null && partNumber.getExtraInfoFromEnoviaPartDto() != null ? partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPartRevision() : "");
            row.getCell(8).setCellValue(partNumber != null && partNumber.getExtraInfoFromEnoviaPartDto() != null ? partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaDecPSA() : "");
            row.getCell(9).setCellValue(partNumber != null && partNumber.getExtraInfoFromEnoviaPartDto() != null ? partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaProductNature() : "");
            
    
            if (partNumber.getBomUsages() != null && !partNumber.getBomUsages().isEmpty()) {
                
                for (UpstreamResponseBomUsagesDto bomUsage : partNumber.getBomUsages()) {
                    
                    int bomUsageStartRow = currentRow;  // Remember the starting row for this BOM usage
    
                    if (currentRow != partNumberStartRow) {  
                        row = sheet.createRow(currentRow);
                    }
    
                    row.createCell(11).setCellValue(bomUsage.getCode());
                    row.createCell(12).setCellValue(bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaProductLineName());
                    row.createCell(13).setCellValue(bomUsage.getDescription());
                    row.createCell(14).setCellValue(bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaBOC());

                    // VOM usages
                    if (bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList() != null &&
                        !bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList().isEmpty()) {
                        
                        for (UpstreamResponseExtraInfoFromEnoviaVOMDto vomUsage : bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList()) {
                            
                            if (currentRow != bomUsageStartRow) {
                                row = sheet.createRow(currentRow);
                            }
    
                            row.createCell(15).setCellValue(vomUsage.getExtraInfoFromEnoviaVOMName());
                            row.createCell(16).setCellValue(vomUsage.getExtraInfoFromEnoviaVOMDescription());
                            row.createCell(17).setCellValue(vomUsage.getExtraInfoFromEnoviaVOMPlantName());

                            row.createCell(18).setCellValue(partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPdefFromPrea() != null ? partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPdefFromPrea() : "");
                            row.createCell(19).setCellValue(partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPreaFromPdef() != null ? partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPreaFromPdef() : "");
                            
                            row.createCell(20).setCellValue(partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPdefBomAssembly() != null && "true".equals(partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPdefBomAssembly()) ? "Y" : "N");
                            row.createCell(21).setCellValue(partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPdefBomComponent() != null && "true".equals(partNumber.getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPdefBomComponent()) ? "Y" : "N");;

                            
                            currentRow++;
                        }
                    } else {
                        currentRow++;
                    }
    
                    // Merge cells for BOM usage columns if extra rows were added due to VOM usages
                    if (bomUsageStartRow < currentRow - 1) {
                        for (int column : bomUsageColumns) {
                            sheet.addMergedRegion(new CellRangeAddress(bomUsageStartRow, currentRow - 1, column, column));
                        }
                    }
                }
            } else {
                currentRow++;
            }
    
            // Merge cells for part number columns if extra rows were added
            if (partNumberStartRow < currentRow - 1) {
                for (int column : partNumberColumns) {
                    sheet.addMergedRegion(new CellRangeAddress(partNumberStartRow, currentRow - 1, column, column));
                }
            }
            if (partNumberStartRow < currentRow - 1) {
                for (int column : extraMergeColumns) {
                    sheet.addMergedRegion(new CellRangeAddress(partNumberStartRow, currentRow - 1, column, column));
                }
            }
        }

        unmergeAllInColumn(sheet, columnKIndex); // 10 is index of column K ( static column must be empty )
        mergeColumnFromRow(sheet, columnKIndex, 0); // Starts merging from row index 2 (third row in the sheet) for column K

        // style for column K
        CellStyle grayStyle = wb.createCellStyle();
        grayStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        grayStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        grayStyle.setVerticalAlignment(VerticalAlignment.CENTER);


        Font bigFont = wb.createFont();
        bigFont.setFontHeightInPoints((short) 14);  // Adjust the font size as required
        grayStyle.setFont(bigFont);
        grayStyle.setRotation((short) 90);  // For vertical text orientation

        Row row = sheet.getRow(0);  // Assuming the merged region starts at row 2 (0-based index)
        if (row == null) {
            row = sheet.createRow(0);
        }
        Cell cell = row.getCell(10, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);  // 10 is column K (0-based index)
        cell.setCellValue("To the left is static");
        cell.setCellStyle(grayStyle);

        return wb;
    }

    private void mergeColumnFromRow(Sheet sheet, int columnIndex, int startRow) {
        int lastRow = sheet.getLastRowNum(); // Gets the last row index that has data
        if (lastRow >= startRow) { // Check to ensure there's data to merge
            CellRangeAddress mergeRegion = new CellRangeAddress(startRow, lastRow, columnIndex, columnIndex);
            sheet.addMergedRegion(mergeRegion);
        }
    }

    private void unmergeAllInColumn(Sheet sheet, int columnIndex) {
        List<CellRangeAddress> mergedRegionsInColumn = getMergedRegionsInColumn(sheet, columnIndex);
        
        // Since removing merged regions modifies the list, iterate in reverse
        for (int i = mergedRegionsInColumn.size() - 1; i >= 0; i--) {
            sheet.removeMergedRegion(mergedRegionsInColumn.get(i).getFirstRow());
        }
    }
    
    private List<CellRangeAddress> getMergedRegionsInColumn(Sheet sheet, int columnIndex) {
        List<CellRangeAddress> mergedRegionsInColumn = new ArrayList<>();
    
        for (int i = 0; i < sheet.getNumMergedRegions(); i++) {
            CellRangeAddress mergedRegion = sheet.getMergedRegion(i);
            if (mergedRegion.getFirstColumn() <= columnIndex && mergedRegion.getLastColumn() >= columnIndex) {
                mergedRegionsInColumn.add(mergedRegion);
            }
        }
    
        return mergedRegionsInColumn;
    }
    
    // public FileOutputStream writeExcel() {

    //     // here we need to pass callback response
    //     UpstreamResponseDto mock = new UpstreamResponseDto();
    //     Workbook wb = init(mock);

    //     // wb = writeSheet1(wb);
    //     // wb = writeSheet2(wb);

    //     UpstreamResponseDto upstreamResponseDto = new UpstreamResponseDto();
    //     List<UpstreamResponsePartNumberDto> partNumberList = new ArrayList<>();
    //     UpstreamResponsePartNumberDto b = new UpstreamResponsePartNumberDto();
    //     b.setPartNumber("123");
    //     b.setBomSystem("CoDep");
    //     b.setLocalPrimaryDesignation("PRIMARY DESIGNATION");
    //     b.setLocalSecondaryDesignation("SECONDARY DESIGNATION");


    //     UpstreamResponseExtraInfoFromEnoviaPartDto x = new UpstreamResponseExtraInfoFromEnoviaPartDto ();
    //     x.setExtraInfoFromEnoviaIndexPsa("00");
    //     x.setExtraInfoFromEnoviaPartType("TYPE");
    //     x.setExtraInfoFromEnoviaPartName("A-xxxxxx");
    //     x.setExtraInfoFromEnoviaPartRevision("1");
    //     // PSA DECOUPAGE TODO ?
    //     x.setExtraInfoFromEnoviaProductNature("NATURE");
    //     x.setExtraInfoFromEnoviaLaunchProjectName("project name");
    //     x.setExtraInfoFromEnoviaPreaFromPdef("PREA from DEF");
    //     x.setExtraInfoFromEnoviaPdefFromPrea("PDF from PREA");
    //     x.setExtraInfoFromEnoviaPdefBomAssembly("true");
    //     b.setExtraInfoFromEnoviaPartDto(x);


    //     List<UpstreamResponseBomUsagesDto> c = new ArrayList<>();
    //     UpstreamResponseBomUsagesDto upb = new UpstreamResponseBomUsagesDto();
    //     upb.setCode("CODE BOM USAGE");
    //     upb.setDescription("DESCRIPTION BOM USAGE");
    //     UpstreamResponseExtraInfoFromEnoviaBOMUsageDto bom = new UpstreamResponseExtraInfoFromEnoviaBOMUsageDto ();
    //     bom.setExtraInfoFromEnoviaProductLineName("PRODUCT LINE NAME");
    //     // Product line description ?
    //     bom.setExtraInfoFromEnoviaBOC("BOC");

    //     List<UpstreamResponseExtraInfoFromEnoviaVOMDto> vl = new ArrayList<>();
    //     UpstreamResponseExtraInfoFromEnoviaVOMDto v = new UpstreamResponseExtraInfoFromEnoviaVOMDto();
    //     v.setExtraInfoFromEnoviaVOMDescription("VOM DESC");
    //     v.setExtraInfoFromEnoviaVOMName("VOM NAME");
    //     v.setExtraInfoFromEnoviaVOMPlantName("manufacture name");
    //     UpstreamResponseExtraInfoFromEnoviaVOMDto v2 = new UpstreamResponseExtraInfoFromEnoviaVOMDto();
    //     v2.setExtraInfoFromEnoviaVOMDescription("VOM DESC é2222");
    //     v2.setExtraInfoFromEnoviaVOMName("VOM XDDDD");
    //     v2.setExtraInfoFromEnoviaVOMPlantName("manufacture AIEJIJA");
    //     vl.add(v);
    //     vl.add(v);
    //     vl.add(v2);
        
    //     bom.setExtraInfoFromEnoviaVOMList(vl);

        
    //     c.add(upb);
    //     c.add(upb);
    //     c.add(upb);
    //     c.add(upb);
    //     c.add(upb);

    //     upb.setExtraInfoFromEnoviaBOMUsage(bom);

    //     b.setBomUsages(c);


    //     partNumberList.add(b);
    //     partNumberList.add(b);

    //     upstreamResponseDto.setPartNumberList(partNumberList);

    //     wb = writeSheet3(wb, upstreamResponseDto);

    //     return saveWorkbook(wb, "C:\\Workspace\\cddd\\generated.xlsx");
    // }

    public Workbook init() {
        try {
            return new XSSFWorkbook(getClass().getResourceAsStream("/excel/template.xlsx"));    
        } catch ( IOException e ) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    

    public Workbook writeSheet1(Workbook wb) {

        List<List<PartNumberResponseDto>> X = new ArrayList<>();
        

        



        int sheet1Index = 0;
        Sheet sheet = wb.getSheetAt(sheet1Index);
        Row row = sheet.getRow(3);
        if ( row == null ) {
            row = sheet.createRow(3);
        }

        Cell cell = row.getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
        cell.setCellValue("Hellow World");

        try {
            System.out.println(wb.getNumberOfSheets());
            return wb;
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
            return wb;
        }
    }

    public Workbook writeSheet2(Workbook wb) {
        try {
            System.out.println("Implement me wh 2");
            return wb;
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
            return wb;
        }
    }


    public FileOutputStream saveWorkbook(Workbook wb, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            wb.write(fileOut);
            return fileOut;
        } catch (IOException e) {
            System.out.println("Error saving the Excel file: " + e.getMessage());
            return null;
        }
    }


}
