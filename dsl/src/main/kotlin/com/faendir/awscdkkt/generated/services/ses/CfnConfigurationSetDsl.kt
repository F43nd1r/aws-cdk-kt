package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import software.amazon.awscdk.services.ses.CfnConfigurationSetProps
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
public fun Construct.cfnConfigurationSet(id: String): CfnConfigurationSet =
    CfnConfigurationSet(this, id)

@Generated
public fun Construct.cfnConfigurationSet(id: String, initializer: @AwsCdkDsl
    CfnConfigurationSet.() -> Unit): CfnConfigurationSet = CfnConfigurationSet(this,
    id).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationSet(id: String, initializer: @AwsCdkDsl
    CfnConfigurationSet.Builder.() -> Unit): CfnConfigurationSet =
    CfnConfigurationSet.Builder.create(this, id).apply(initializer).build()
