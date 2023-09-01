package com.faendir.awscdkkt.generated.services.emr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInstanceGroupConfig(
  id: String,
  props: CfnInstanceGroupConfigProps,
  initializer: @AwsCdkDsl CfnInstanceGroupConfig.() -> Unit = {},
): CfnInstanceGroupConfig = CfnInstanceGroupConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInstanceGroupConfig(id: String, initializer: @AwsCdkDsl
    CfnInstanceGroupConfig.Builder.() -> Unit = {}): CfnInstanceGroupConfig =
    CfnInstanceGroupConfig.Builder.create(this, id).apply(initializer).build()
