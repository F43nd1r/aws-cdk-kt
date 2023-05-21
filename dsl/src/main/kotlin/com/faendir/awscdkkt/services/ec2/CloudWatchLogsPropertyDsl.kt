package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

@Generated
public
    fun cloudWatchLogsProperty(initializer: CfnVerifiedAccessInstance.CloudWatchLogsProperty.Builder.() -> Unit
    = {}): CfnVerifiedAccessInstance.CloudWatchLogsProperty =
    CfnVerifiedAccessInstance.CloudWatchLogsProperty.builder().apply(initializer).build()
