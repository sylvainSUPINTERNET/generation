package com.example.cddd.services;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.sl.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
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
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaPreaFromPdef("PREA from DEF");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaPdefFromPrea("PDF from PREA");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaPdefBomAssembly("true");
        extraInfoFromEnoviaPartDto.setExtraInfoFromEnoviaPdefBomAssembly("true");
        partNumber1.setExtraInfoFromEnoviaPartDto(extraInfoFromEnoviaPartDto);

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
        bomUsage1.setExtraInfoFromEnoviaBOMUsage(extraInfoFromEnoviaBOMUsageDto);
        bomUsage2.setExtraInfoFromEnoviaBOMUsage(extraInfoFromEnoviaBOMUsageDto2); // NO VOM 
        bomUsages.add(bomUsage1);
        bomUsages.add(bomUsage2);


        partNumber1.setBomUsages(bomUsages);

        partNumberList.add(partNumber1);
        partNumberList.add(partNumber2);
        mock.setPartNumberList(partNumberList);

        wb = writeSheet3CleanEz(wb, mock);

        // return saveWorkbook(, "C:\\Workspace\\cddd\\generated.xlsx");
        return saveWorkbook(wb, "E:\\Workspace\\generation\\generated.xlsx");
    }


    private Workbook writeSheet3CleanEz(Workbook wb, UpstreamResponseDto upstreamResponseDto) {
        Sheet sheet = wb.createSheet("sheet4");
        List<Integer> partNumberColumns = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> bomUsageColumns = Arrays.asList(11,12); // Assuming these columns for BOM usages
    
        int currentRow = 0;
    
        for (UpstreamResponsePartNumberDto partNumber : upstreamResponseDto.getPartNumberList()) {
            
            int partNumberStartRow = currentRow; 
    
            Row row = sheet.createRow(currentRow);
            for (int column : partNumberColumns) {
                row.createCell(column);
            }
            
            row.getCell(0).setCellValue(partNumber.getPartNumber());
            row.getCell(1).setCellValue(partNumber.getBomSystem());
            // TODO: other part number fields
    
            if (partNumber.getBomUsages() != null && !partNumber.getBomUsages().isEmpty()) {
                
                for (UpstreamResponseBomUsagesDto bomUsage : partNumber.getBomUsages()) {
                    
                    int bomUsageStartRow = currentRow;  // Remember the starting row for this BOM usage
    
                    if (currentRow != partNumberStartRow) {  
                        row = sheet.createRow(currentRow);
                    }
    
                    row.createCell(11).setCellValue(bomUsage.getCode());
                    row.createCell(12).setCellValue(bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaProductLineName());
    
                    // VOM usages
                    if (bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList() != null &&
                        !bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList().isEmpty()) {
                        
                        for (UpstreamResponseExtraInfoFromEnoviaVOMDto vomUsage : bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList()) {
                            
                            if (currentRow != bomUsageStartRow) {
                                row = sheet.createRow(currentRow);
                            }
    
                            row.createCell(14).setCellValue(vomUsage.getExtraInfoFromEnoviaVOMName());
                            row.createCell(15).setCellValue(vomUsage.getExtraInfoFromEnoviaVOMDescription());
                            
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
        }
    
        return wb;
    }
    

    private Workbook writeSheet3Clean(Workbook wb, UpstreamResponseDto upstreamResponseDto) {
        // Assuming sheet already exists at index 0. Otherwise, create a new one.
        Sheet sheet = wb.createSheet("sheet4");

        List<Integer> partNumberColumns = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> bomUsageColumns = Arrays.asList(11,12,13,14);

        int currentRow = 0;

        for ( int i = 0; i < upstreamResponseDto.getPartNumberList().size(); i++) {
           
            System.out.println("Part number row " + currentRow); 
            Row row = sheet.createRow(currentRow);

            partNumberColumns.forEach( column -> {
                row.createCell(column);
            });

            bomUsageColumns.forEach( column -> {
                row.createCell(column);
            });

            UpstreamResponsePartNumberDto partNumber = upstreamResponseDto.getPartNumberList().get(i);
            row.getCell(0).setCellValue(partNumber.getPartNumber());
            row.getCell(1).setCellValue(partNumber.getBomSystem());
            // TODO other field part number

            if (partNumber.getBomUsages() != null) {
                if ( !partNumber.getBomUsages().isEmpty() ) {

                    // BOM USAGES
                    int countExtraRowAdded = 0;
                    for ( int x = 0; x < partNumber.getBomUsages().size(); x++ ) {
                        // logic is we add one row for each bom usage, also means, we need to "pad" the extra line in part number side ( merge cells )
                        UpstreamResponseBomUsagesDto bomUsage = partNumber.getBomUsages().get(x);
                        
                        if ( sheet.getRow(currentRow) == null ) {
                            Row newRow = sheet.createRow(currentRow);
                            countExtraRowAdded++;
                            System.out.println("bom usage create new row " + currentRow);
                            newRow.createCell(11);
                            newRow.createCell(12);
                            // TODO continue
                        }

                        System.out.println("--- bom usage row " + currentRow + " : " + bomUsage.getCode());
                        sheet.getRow(currentRow).getCell(11).setCellValue(bomUsage.getCode());
                        sheet.getRow(currentRow).getCell(12).setCellValue(bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaProductLineName());
                            // TODO continue

                        // VOM
                        if ( bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList() != null ) {

                            if ( !bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList().isEmpty() ) {
                                
                                for ( int v = 0; v < bomUsage.getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList().size(); v++ ) {
                                    System.out.println("----- VOM usage row" + currentRow);
                                    UpstreamResponseExtraInfoFromEnoviaVOMDto vomUsage = partNumber.getBomUsages().get(x).getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList().get(v);
                                    
                                    if ( sheet.getRow(currentRow) == null ) {
                                        Row newRow = sheet.createRow(currentRow);
                                        countExtraRowAdded++;
                                        System.out.println("VOM usage create new row " + currentRow);
                                        newRow.createCell(14);
                                        newRow.createCell(15);
                                        // TODO continue
                                    }
                                    System.out.println("----- VOM usage row " + currentRow + " : " + vomUsage.getExtraInfoFromEnoviaVOMName());

                                    sheet.getRow(currentRow).getCell(14).setCellValue(vomUsage.getExtraInfoFromEnoviaVOMName());
                                    sheet.getRow(currentRow).getCell(15).setCellValue(vomUsage.getExtraInfoFromEnoviaVOMDescription());

                                    // TODO
                                }

                            }
                        }

                        currentRow++;
                    }

                    //TODO à la fin on merge cellule pour vom / puis pour bom usage / puis part number
                    // Merge part number section with extra row added by bom usage
                    // if ( countExtraRowAdded != 0 ) {
                    //     for ( int y = 0; y < partNumberColumns.size(); y++) {
                    //         sheet.addMergedRegion(new CellRangeAddress(i, i + countExtraRowAdded, y, y));
                    //     }
                    // }

                }
            }

            // currentRow++;

            
        }
    


        return wb;
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
    
    public Workbook writeSheet3(Workbook wb, UpstreamResponseDto upstreamResponseDto) {
        try {
    
            Sheet sheet = wb.getSheet("sheet3");

            List<UpstreamResponsePartNumberDto> partNumbers = upstreamResponseDto.getPartNumberList();
            List<List<UpstreamResponseBomUsagesDto>> bomUsages = partNumbers.stream().map( partNumber -> {
                return partNumber.getBomUsages();
            }).collect(Collectors.toList());
    
            int currentRowNum = 2; // 2 because header is 1 and we want to start at 2
            int totalRows = 0;
            Cell cellK = null;

            for (int i = 0; i < partNumbers.size(); i++) {
                Row row = sheet.createRow(currentRowNum);
                
                Cell cellA = row.createCell(0);
                cellA.setCellValue(partNumbers.get(i).getPartNumber());
    
                Cell cellB = row.createCell(1);
                cellB.setCellValue(partNumbers.get(i).getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaIndexPsa());
    

                Cell cellC = row.createCell(2);
                cellC.setCellValue(partNumbers.get(i).getBomSystem());

                Cell cellD = row.createCell(3);
                cellD.setCellValue(partNumbers.get(i).getLocalPrimaryDesignation());

                Cell cellE = row.createCell(4);
                cellE.setCellValue(partNumbers.get(i).getLocalSecondaryDesignation());
                
                Cell cellF = row.createCell(5);
                cellF.setCellValue(partNumbers.get(i).getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPartType());

                Cell cellG = row.createCell(6);
                cellG.setCellValue("TODO ENOVIA ID ?");

                Cell cellH = row.createCell(7);
                cellH.setCellValue(partNumbers.get(i).getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaPartRevision());

                Cell cellI = row.createCell(8);
                cellI.setCellValue("TODO decoupage");

                Cell cellJ = row.createCell(9);
                cellJ.setCellValue(partNumbers.get(i).getExtraInfoFromEnoviaPartDto().getExtraInfoFromEnoviaProductNature());

                cellK = row.createCell(10); // column for separator between 

                Cell cellL = row.createCell(11);
                cellL.setCellValue(bomUsages.get(i).get(0).getCode());
                
                Cell cellM = row.createCell(12);
                cellM.setCellValue(bomUsages.get(i).get(0).getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaProductLineName());

                Cell cellN = row.createCell(13);
                cellN.setCellValue(bomUsages.get(i).get(0).getDescription());

                Cell cellO = row.createCell(14);
                cellO.setCellValue(bomUsages.get(i).get(0).getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaBOC());;

                Cell cellP = row.createCell(15);
                cellP.setCellValue(bomUsages.get(i).get(0).getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList().get(0).getExtraInfoFromEnoviaVOMName());

                for (int j = 1; j < bomUsages.get(i).size(); j++) {
                    totalRows += bomUsages.get(i).size();

                    currentRowNum++; 
                    Row valueRow = sheet.createRow(currentRowNum);
                    

                    Cell valueCellL = valueRow.createCell(11);
                    valueCellL.setCellValue(bomUsages.get(i).get(j).getCode());
                    sheet.autoSizeColumn(11, false);

                    Cell valueCellM = valueRow.createCell(12);
                    valueCellM.setCellValue(bomUsages.get(i).get(j).getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaProductLineName());
                    sheet.autoSizeColumn(12, false);

                    Cell valueCellN = valueRow.createCell(13);
                    valueCellN.setCellValue(bomUsages.get(i).get(j).getDescription());
                    sheet.autoSizeColumn(13, false);

                    Cell valueCellO = valueRow.createCell(14);
                    valueCellO.setCellValue(bomUsages.get(i).get(j).getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaBOC());
                    sheet.autoSizeColumn(14, false);

                    for ( int x = 0; x < bomUsages.get(i).get(j).getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList().size(); x++) {
                        System.out.println(bomUsages.get(i).get(j).getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList().get(x).getExtraInfoFromEnoviaVOMName());
                        Cell valueCellP = valueRow.createCell(15);
                        valueCellP.setCellValue(bomUsages.get(i).get(j).getExtraInfoFromEnoviaBOMUsage().getExtraInfoFromEnoviaVOMList().get(x).getExtraInfoFromEnoviaVOMName());
                        sheet.autoSizeColumn(15, false);
                    }
                    
                    
                }
                
                if (bomUsages.get(i).size() > 1) {
    
                    // 10 first columns will be merged
                    for ( int y=0; y<10;y++) {
                        sheet.addMergedRegion(new CellRangeAddress(currentRowNum - bomUsages.get(i).size() + 1, currentRowNum, y, y));
                    }                

                }
    
                currentRowNum++;
            }

            if ( totalRows > 1 ) {
                if ( cellK != null ) {
                    CellStyle style = wb.createCellStyle();
                    style.setAlignment(HorizontalAlignment.CENTER); // Center align horizontally
                    style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex()); // Set gray background
                    style.setFillPattern(FillPatternType.SOLID_FOREGROUND); // Specify fill pattern as solid
                    style.setRotation((short) -90); // Rotate text to 45 degrees
    
                    sheet.addMergedRegion(new CellRangeAddress(0, totalRows - 1, 10, 10)); // Merging the entire column (assuming no header).
                    cellK.setCellValue("To the left is static");
                    cellK.setCellStyle(style);
                }

            }
    
            try (FileOutputStream fileOut = new FileOutputStream("C:\\Workspace\\cddd\\generated.xlsx")) {
                wb.write(fileOut);
            }
    
            return wb;
    
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
            return wb;
        }
    }

    // j'ai la réponse
    // je fais une matrice tel que : [ [PartNumber.partNumber, ..., ] , [PartNumber.partNumber] ]
    // chaque tableau represent une row entière
    // Chaque corresponds à une partNumber

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
