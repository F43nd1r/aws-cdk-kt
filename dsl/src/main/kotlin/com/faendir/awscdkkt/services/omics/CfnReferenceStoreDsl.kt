@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
