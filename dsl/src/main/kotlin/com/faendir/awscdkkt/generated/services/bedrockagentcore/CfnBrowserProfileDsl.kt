package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnBrowserProfile
import software.amazon.awscdk.services.bedrockagentcore.CfnBrowserProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBrowserProfile(
  id: String,
  props: CfnBrowserProfileProps,
  initializer: @AwsCdkDsl CfnBrowserProfile.() -> Unit = {},
): CfnBrowserProfile = CfnBrowserProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBrowserProfile(id: String, initializer: @AwsCdkDsl CfnBrowserProfile.Builder.() -> Unit = {}): CfnBrowserProfile = CfnBrowserProfile.Builder.create(this, id).apply(initializer).build()
