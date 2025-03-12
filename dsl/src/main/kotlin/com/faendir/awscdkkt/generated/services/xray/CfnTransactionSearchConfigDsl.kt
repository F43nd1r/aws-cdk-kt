package com.faendir.awscdkkt.generated.services.xray

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnTransactionSearchConfig
import software.amazon.awscdk.services.xray.CfnTransactionSearchConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransactionSearchConfig(id: String, initializer: @AwsCdkDsl
    CfnTransactionSearchConfig.() -> Unit = {}): CfnTransactionSearchConfig =
    CfnTransactionSearchConfig(this, id).apply(initializer)

@Generated
public fun Construct.cfnTransactionSearchConfig(
  id: String,
  props: CfnTransactionSearchConfigProps,
  initializer: @AwsCdkDsl CfnTransactionSearchConfig.() -> Unit = {},
): CfnTransactionSearchConfig = CfnTransactionSearchConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransactionSearchConfig(id: String, initializer: @AwsCdkDsl
    CfnTransactionSearchConfig.Builder.() -> Unit = {}): CfnTransactionSearchConfig =
    CfnTransactionSearchConfig.Builder.create(this, id).apply(initializer).build()
