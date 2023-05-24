package com.faendir.awscdkkt.generated.services.pinpointemail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationSet(id: String, props: CfnConfigurationSetProps):
    CfnConfigurationSet = CfnConfigurationSet(this, id, props)

@Generated
public fun Construct.cfnConfigurationSet(
  id: String,
  props: CfnConfigurationSetProps,
  initializer: @AwsCdkDsl CfnConfigurationSet.() -> Unit,
): CfnConfigurationSet = CfnConfigurationSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationSet(id: String, initializer: @AwsCdkDsl
    CfnConfigurationSet.Builder.() -> Unit): CfnConfigurationSet =
    CfnConfigurationSet.Builder.create(this, id).apply(initializer).build()
