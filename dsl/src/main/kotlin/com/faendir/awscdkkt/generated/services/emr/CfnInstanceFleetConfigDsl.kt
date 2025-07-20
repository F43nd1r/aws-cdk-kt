package com.faendir.awscdkkt.generated.services.emr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInstanceFleetConfig(
  id: String,
  props: CfnInstanceFleetConfigProps,
  initializer: @AwsCdkDsl CfnInstanceFleetConfig.() -> Unit = {},
): CfnInstanceFleetConfig = CfnInstanceFleetConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInstanceFleetConfig(id: String, initializer: @AwsCdkDsl CfnInstanceFleetConfig.Builder.() -> Unit = {}): CfnInstanceFleetConfig = CfnInstanceFleetConfig.Builder.create(this, id).apply(initializer).build()
