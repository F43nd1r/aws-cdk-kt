@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnSequenceStore
import software.amazon.awscdk.services.omics.CfnSequenceStoreProps
import software.constructs.Construct

public fun Construct.cfnSequenceStore(
  id: String,
  props: CfnSequenceStoreProps,
  initializer: CfnSequenceStore.() -> Unit = {},
): CfnSequenceStore = CfnSequenceStore(this, id, props).apply(initializer)
