package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnReferenceStore
import software.amazon.awscdk.services.omics.CfnReferenceStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReferenceStore(
  id: String,
  props: CfnReferenceStoreProps,
  initializer: CfnReferenceStore.() -> Unit = {},
): CfnReferenceStore = CfnReferenceStore(this, id, props).apply(initializer)
