package com.faendir.awscdkkt.generated.services.smsvoice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.smsvoice.CfnConfigurationSet
import software.amazon.awscdk.services.smsvoice.CfnConfigurationSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationSet(id: String, initializer: @AwsCdkDsl CfnConfigurationSet.() -> Unit = {}): CfnConfigurationSet = CfnConfigurationSet(this, id).apply(initializer)

@Generated
public fun Construct.cfnConfigurationSet(
  id: String,
  props: CfnConfigurationSetProps,
  initializer: @AwsCdkDsl CfnConfigurationSet.() -> Unit = {},
): CfnConfigurationSet = CfnConfigurationSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationSet(id: String, initializer: @AwsCdkDsl CfnConfigurationSet.Builder.() -> Unit = {}): CfnConfigurationSet = CfnConfigurationSet.Builder.create(this, id).apply(initializer).build()
