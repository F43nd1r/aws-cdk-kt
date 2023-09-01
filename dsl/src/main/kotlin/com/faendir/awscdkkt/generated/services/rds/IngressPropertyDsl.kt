package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup

@Generated
public fun buildIngressProperty(initializer: @AwsCdkDsl
    CfnDBSecurityGroup.IngressProperty.Builder.() -> Unit = {}): CfnDBSecurityGroup.IngressProperty
    = CfnDBSecurityGroup.IngressProperty.Builder().apply(initializer).build()
