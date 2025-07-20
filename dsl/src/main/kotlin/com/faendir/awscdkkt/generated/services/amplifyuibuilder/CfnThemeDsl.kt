package com.faendir.awscdkkt.generated.services.amplifyuibuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplifyuibuilder.CfnTheme
import software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTheme(id: String, initializer: @AwsCdkDsl CfnTheme.() -> Unit = {}): CfnTheme = CfnTheme(this, id).apply(initializer)

@Generated
public fun Construct.cfnTheme(
  id: String,
  props: CfnThemeProps,
  initializer: @AwsCdkDsl CfnTheme.() -> Unit = {},
): CfnTheme = CfnTheme(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTheme(id: String, initializer: @AwsCdkDsl CfnTheme.Builder.() -> Unit = {}): CfnTheme = CfnTheme.Builder.create(this, id).apply(initializer).build()
