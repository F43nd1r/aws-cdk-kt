package com.faendir.awscdkkt.generated.services.resiliencehub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehub.CfnApp
import software.amazon.awscdk.services.resiliencehub.CfnAppProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApp(
  id: String,
  props: CfnAppProps,
  initializer: @AwsCdkDsl CfnApp.() -> Unit = {},
): CfnApp = CfnApp(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApp(id: String, initializer: @AwsCdkDsl CfnApp.Builder.() -> Unit =
    {}): CfnApp = CfnApp.Builder.create(this, id).apply(initializer).build()
