package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnWorkteam
import software.amazon.awscdk.services.sagemaker.CfnWorkteamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkteam(id: String, initializer: CfnWorkteam.() -> Unit = {}): CfnWorkteam
    = CfnWorkteam(this, id).apply(initializer)

@Generated
public fun Construct.cfnWorkteam(
  id: String,
  props: CfnWorkteamProps,
  initializer: CfnWorkteam.() -> Unit = {},
): CfnWorkteam = CfnWorkteam(this, id, props).apply(initializer)
