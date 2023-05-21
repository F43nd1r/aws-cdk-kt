package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@Generated
public fun s3OutputProperty(initializer: CfnMonitoringSchedule.S3OutputProperty.Builder.() -> Unit =
    {}): CfnMonitoringSchedule.S3OutputProperty =
    CfnMonitoringSchedule.S3OutputProperty.builder().apply(initializer).build()
