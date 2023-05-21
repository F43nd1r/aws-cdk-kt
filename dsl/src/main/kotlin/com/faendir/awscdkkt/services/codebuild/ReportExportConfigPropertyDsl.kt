package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnReportGroup

@Generated
public
    fun reportExportConfigProperty(initializer: CfnReportGroup.ReportExportConfigProperty.Builder.() -> Unit
    = {}): CfnReportGroup.ReportExportConfigProperty =
    CfnReportGroup.ReportExportConfigProperty.builder().apply(initializer).build()
