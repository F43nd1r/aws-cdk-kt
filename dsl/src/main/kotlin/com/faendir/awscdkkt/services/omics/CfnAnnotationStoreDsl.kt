@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnAnnotationStore
import software.amazon.awscdk.services.omics.CfnAnnotationStoreProps
import software.constructs.Construct

public fun Construct.cfnAnnotationStore(
  id: String,
  props: CfnAnnotationStoreProps,
  initializer: CfnAnnotationStore.() -> Unit = {},
): CfnAnnotationStore = CfnAnnotationStore(this, id, props).apply(initializer)
