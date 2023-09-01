package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnWorkteam
import software.amazon.awscdk.services.sagemaker.CfnWorkteamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkteam(id: String, initializer: @AwsCdkDsl CfnWorkteam.() -> Unit = {}):
    CfnWorkteam = CfnWorkteam(this, id).apply(initializer)

@Generated
public fun Construct.cfnWorkteam(
  id: String,
  props: CfnWorkteamProps,
  initializer: @AwsCdkDsl CfnWorkteam.() -> Unit = {},
): CfnWorkteam = CfnWorkteam(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkteam(id: String, initializer: @AwsCdkDsl
    CfnWorkteam.Builder.() -> Unit = {}): CfnWorkteam = CfnWorkteam.Builder.create(this,
    id).apply(initializer).build()
