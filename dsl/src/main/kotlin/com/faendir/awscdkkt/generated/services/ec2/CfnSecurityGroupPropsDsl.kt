package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroupProps

@Generated
public fun buildCfnSecurityGroupProps(initializer: @AwsCdkDsl
    CfnSecurityGroupProps.Builder.() -> Unit = {}): CfnSecurityGroupProps =
    CfnSecurityGroupProps.Builder().apply(initializer).build()
