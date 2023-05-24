package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInputSecurityGroup(id: String, props: CfnInputSecurityGroupProps):
    CfnInputSecurityGroup = CfnInputSecurityGroup(this, id, props)

@Generated
public fun Construct.cfnInputSecurityGroup(
  id: String,
  props: CfnInputSecurityGroupProps,
  initializer: @AwsCdkDsl CfnInputSecurityGroup.() -> Unit,
): CfnInputSecurityGroup = CfnInputSecurityGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnInputSecurityGroup(id: String): CfnInputSecurityGroup =
    CfnInputSecurityGroup(this, id)

@Generated
public fun Construct.cfnInputSecurityGroup(id: String, initializer: @AwsCdkDsl
    CfnInputSecurityGroup.() -> Unit): CfnInputSecurityGroup = CfnInputSecurityGroup(this,
    id).apply(initializer)

@Generated
public fun Construct.buildCfnInputSecurityGroup(id: String, initializer: @AwsCdkDsl
    CfnInputSecurityGroup.Builder.() -> Unit): CfnInputSecurityGroup =
    CfnInputSecurityGroup.Builder.create(this, id).apply(initializer).build()
