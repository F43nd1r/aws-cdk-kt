package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public fun buildCpuProperty(initializer: @AwsCdkDsl CfnLaunchTemplate.CpuProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.CpuProperty =
    CfnLaunchTemplate.CpuProperty.Builder().apply(initializer).build()
