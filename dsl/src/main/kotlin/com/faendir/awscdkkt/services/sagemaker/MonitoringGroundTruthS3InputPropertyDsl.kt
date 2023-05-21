package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@Generated
public
    fun monitoringGroundTruthS3InputProperty(initializer: CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty.Builder.() -> Unit
    = {}): CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty =
    CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty.builder().apply(initializer).build()
