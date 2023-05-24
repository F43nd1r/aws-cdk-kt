package com.faendir.awscdkkt.generated.services.evidently

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnSegment
import software.amazon.awscdk.services.evidently.CfnSegmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSegment(id: String, props: CfnSegmentProps): CfnSegment = CfnSegment(this,
    id, props)

@Generated
public fun Construct.cfnSegment(
  id: String,
  props: CfnSegmentProps,
  initializer: @AwsCdkDsl CfnSegment.() -> Unit,
): CfnSegment = CfnSegment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSegment(id: String, initializer: @AwsCdkDsl
    CfnSegment.Builder.() -> Unit): CfnSegment = CfnSegment.Builder.create(this,
    id).apply(initializer).build()
