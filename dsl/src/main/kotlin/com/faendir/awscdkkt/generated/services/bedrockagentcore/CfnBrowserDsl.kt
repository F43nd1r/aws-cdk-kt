package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnBrowser
import software.amazon.awscdk.services.bedrockagentcore.CfnBrowserProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBrowser(id: String, initializer: @AwsCdkDsl CfnBrowser.() -> Unit = {}): CfnBrowser = CfnBrowser(this, id).apply(initializer)

@Generated
public fun Construct.cfnBrowser(
  id: String,
  props: CfnBrowserProps,
  initializer: @AwsCdkDsl CfnBrowser.() -> Unit = {},
): CfnBrowser = CfnBrowser(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBrowser(id: String, initializer: @AwsCdkDsl CfnBrowser.Builder.() -> Unit = {}): CfnBrowser = CfnBrowser.Builder.create(this, id).apply(initializer).build()
