package com.faendir.awscdkkt.generated.services.omics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnReference
import software.amazon.awscdk.services.omics.CfnReferenceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReference(id: String, initializer: @AwsCdkDsl CfnReference.() -> Unit = {}): CfnReference = CfnReference(this, id).apply(initializer)

@Generated
public fun Construct.cfnReference(
  id: String,
  props: CfnReferenceProps,
  initializer: @AwsCdkDsl CfnReference.() -> Unit = {},
): CfnReference = CfnReference(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReference(id: String, initializer: @AwsCdkDsl CfnReference.Builder.() -> Unit = {}): CfnReference = CfnReference.Builder.create(this, id).apply(initializer).build()
