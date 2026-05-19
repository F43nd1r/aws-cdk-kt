package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.BrowserCustom
import software.amazon.awscdk.services.bedrockagentcore.BrowserCustomProps
import software.constructs.Construct

@Generated
public fun Construct.browserCustom(id: String, initializer: @AwsCdkDsl BrowserCustom.() -> Unit = {}): BrowserCustom = BrowserCustom(this, id).apply(initializer)

@Generated
public fun Construct.browserCustom(
  id: String,
  props: BrowserCustomProps,
  initializer: @AwsCdkDsl BrowserCustom.() -> Unit = {},
): BrowserCustom = BrowserCustom(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBrowserCustom(id: String, initializer: @AwsCdkDsl BrowserCustom.Builder.() -> Unit = {}): BrowserCustom = BrowserCustom.Builder.create(this, id).apply(initializer).build()
