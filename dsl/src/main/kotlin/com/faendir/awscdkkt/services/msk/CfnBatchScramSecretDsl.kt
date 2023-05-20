@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnBatchScramSecret
import software.amazon.awscdk.services.msk.CfnBatchScramSecretProps
import software.constructs.Construct

public fun Construct.cfnBatchScramSecret(
  id: String,
  props: CfnBatchScramSecretProps,
  initializer: CfnBatchScramSecret.() -> Unit = {},
): CfnBatchScramSecret = CfnBatchScramSecret(this, id, props).apply(initializer)
