@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

public
    fun verifiedAccessLogsProperty(initializer: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.Builder.() -> Unit):
    CfnVerifiedAccessInstance.VerifiedAccessLogsProperty =
    CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.builder().apply(initializer).build()
