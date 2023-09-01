package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnClassifier
import software.amazon.awscdk.services.glue.CfnClassifierProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClassifier(id: String, initializer: @AwsCdkDsl CfnClassifier.() -> Unit =
    {}): CfnClassifier = CfnClassifier(this, id).apply(initializer)

@Generated
public fun Construct.cfnClassifier(
  id: String,
  props: CfnClassifierProps,
  initializer: @AwsCdkDsl CfnClassifier.() -> Unit = {},
): CfnClassifier = CfnClassifier(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnClassifier(id: String, initializer: @AwsCdkDsl
    CfnClassifier.Builder.() -> Unit = {}): CfnClassifier = CfnClassifier.Builder.create(this,
    id).apply(initializer).build()
