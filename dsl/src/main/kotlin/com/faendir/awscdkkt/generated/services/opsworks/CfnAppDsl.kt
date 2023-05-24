package com.faendir.awscdkkt.generated.services.opsworks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnApp
import software.amazon.awscdk.services.opsworks.CfnAppProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApp(id: String, props: CfnAppProps): CfnApp = CfnApp(this, id, props)

@Generated
public fun Construct.cfnApp(
  id: String,
  props: CfnAppProps,
  initializer: @AwsCdkDsl CfnApp.() -> Unit,
): CfnApp = CfnApp(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApp(id: String, initializer: @AwsCdkDsl CfnApp.Builder.() -> Unit):
    CfnApp = CfnApp.Builder.create(this, id).apply(initializer).build()
