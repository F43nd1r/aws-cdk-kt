package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnUsageProfile
import software.amazon.awscdk.services.glue.CfnUsageProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUsageProfile(
  id: String,
  props: CfnUsageProfileProps,
  initializer: @AwsCdkDsl CfnUsageProfile.() -> Unit = {},
): CfnUsageProfile = CfnUsageProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUsageProfile(id: String, initializer: @AwsCdkDsl CfnUsageProfile.Builder.() -> Unit = {}): CfnUsageProfile = CfnUsageProfile.Builder.create(this, id).apply(initializer).build()
