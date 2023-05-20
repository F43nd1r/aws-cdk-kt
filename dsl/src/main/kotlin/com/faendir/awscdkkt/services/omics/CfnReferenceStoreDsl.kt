@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnReferenceStore
import software.amazon.awscdk.services.omics.CfnReferenceStoreProps
import software.constructs.Construct

public fun Construct.cfnReferenceStore(
  id: String,
  props: CfnReferenceStoreProps,
  initializer: CfnReferenceStore.() -> Unit = {},
): CfnReferenceStore = CfnReferenceStore(this, id, props).apply(initializer)
