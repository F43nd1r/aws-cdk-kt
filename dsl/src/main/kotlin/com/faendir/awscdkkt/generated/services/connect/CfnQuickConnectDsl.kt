package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnQuickConnect
import software.amazon.awscdk.services.connect.CfnQuickConnectProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQuickConnect(id: String, props: CfnQuickConnectProps): CfnQuickConnect =
    CfnQuickConnect(this, id, props)

@Generated
public fun Construct.cfnQuickConnect(
  id: String,
  props: CfnQuickConnectProps,
  initializer: @AwsCdkDsl CfnQuickConnect.() -> Unit,
): CfnQuickConnect = CfnQuickConnect(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnQuickConnect(id: String, initializer: @AwsCdkDsl
    CfnQuickConnect.Builder.() -> Unit): CfnQuickConnect = CfnQuickConnect.Builder.create(this,
    id).apply(initializer).build()
