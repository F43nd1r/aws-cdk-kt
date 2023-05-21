package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnReportGroup

@Generated
public
    fun s3ReportExportConfigProperty(initializer: CfnReportGroup.S3ReportExportConfigProperty.Builder.() -> Unit
    = {}): CfnReportGroup.S3ReportExportConfigProperty =
    CfnReportGroup.S3ReportExportConfigProperty.builder().apply(initializer).build()
