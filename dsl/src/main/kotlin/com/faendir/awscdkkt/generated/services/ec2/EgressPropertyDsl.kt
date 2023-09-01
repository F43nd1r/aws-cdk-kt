package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroup

@Generated
public fun buildEgressProperty(initializer: @AwsCdkDsl
    CfnSecurityGroup.EgressProperty.Builder.() -> Unit = {}): CfnSecurityGroup.EgressProperty =
    CfnSecurityGroup.EgressProperty.Builder().apply(initializer).build()
