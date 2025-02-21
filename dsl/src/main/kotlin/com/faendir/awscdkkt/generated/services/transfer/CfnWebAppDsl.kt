package com.faendir.awscdkkt.generated.services.transfer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnWebApp
import software.amazon.awscdk.services.transfer.CfnWebAppProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWebApp(
  id: String,
  props: CfnWebAppProps,
  initializer: @AwsCdkDsl CfnWebApp.() -> Unit = {},
): CfnWebApp = CfnWebApp(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWebApp(id: String, initializer: @AwsCdkDsl CfnWebApp.Builder.() -> Unit
    = {}): CfnWebApp = CfnWebApp.Builder.create(this, id).apply(initializer).build()
