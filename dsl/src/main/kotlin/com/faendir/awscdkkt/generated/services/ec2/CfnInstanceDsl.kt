package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInstance
import software.amazon.awscdk.services.ec2.CfnInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInstance(id: String, initializer: @AwsCdkDsl CfnInstance.() -> Unit = {}):
    CfnInstance = CfnInstance(this, id).apply(initializer)

@Generated
public fun Construct.cfnInstance(
  id: String,
  props: CfnInstanceProps,
  initializer: @AwsCdkDsl CfnInstance.() -> Unit = {},
): CfnInstance = CfnInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInstance(id: String, initializer: @AwsCdkDsl
    CfnInstance.Builder.() -> Unit = {}): CfnInstance = CfnInstance.Builder.create(this,
    id).apply(initializer).build()
