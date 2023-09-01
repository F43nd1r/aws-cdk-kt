package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnBatchScramSecret
import software.amazon.awscdk.services.msk.CfnBatchScramSecretProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBatchScramSecret(
  id: String,
  props: CfnBatchScramSecretProps,
  initializer: @AwsCdkDsl CfnBatchScramSecret.() -> Unit = {},
): CfnBatchScramSecret = CfnBatchScramSecret(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBatchScramSecret(id: String, initializer: @AwsCdkDsl
    CfnBatchScramSecret.Builder.() -> Unit = {}): CfnBatchScramSecret =
    CfnBatchScramSecret.Builder.create(this, id).apply(initializer).build()
