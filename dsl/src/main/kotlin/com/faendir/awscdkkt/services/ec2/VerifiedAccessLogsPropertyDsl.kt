package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

@Generated
public
    fun verifiedAccessLogsProperty(initializer: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.Builder.() -> Unit
    = {}): CfnVerifiedAccessInstance.VerifiedAccessLogsProperty =
    CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.builder().apply(initializer).build()
