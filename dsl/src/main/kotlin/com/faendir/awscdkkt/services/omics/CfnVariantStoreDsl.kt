@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnVariantStore
import software.amazon.awscdk.services.omics.CfnVariantStoreProps
import software.constructs.Construct

public fun Construct.cfnVariantStore(
  id: String,
  props: CfnVariantStoreProps,
  initializer: CfnVariantStore.() -> Unit = {},
): CfnVariantStore = CfnVariantStore(this, id, props).apply(initializer)
