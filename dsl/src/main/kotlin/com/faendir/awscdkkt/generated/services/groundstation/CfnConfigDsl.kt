package com.faendir.awscdkkt.generated.services.groundstation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnConfig
import software.amazon.awscdk.services.groundstation.CfnConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfig(id: String, props: CfnConfigProps): CfnConfig = CfnConfig(this, id,
    props)

@Generated
public fun Construct.cfnConfig(
  id: String,
  props: CfnConfigProps,
  initializer: @AwsCdkDsl CfnConfig.() -> Unit,
): CfnConfig = CfnConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfig(id: String, initializer: @AwsCdkDsl
    CfnConfig.Builder.() -> Unit): CfnConfig = CfnConfig.Builder.create(this,
    id).apply(initializer).build()
