package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnAnnotationStore
import software.amazon.awscdk.services.omics.CfnAnnotationStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnnotationStore(
  id: String,
  props: CfnAnnotationStoreProps,
  initializer: CfnAnnotationStore.() -> Unit = {},
): CfnAnnotationStore = CfnAnnotationStore(this, id, props).apply(initializer)
