package com.faendir.awscdkkt.generated.services.customerprofiles

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinition
import software.amazon.awscdk.services.customerprofiles.CfnSegmentDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSegmentDefinition(
  id: String,
  props: CfnSegmentDefinitionProps,
  initializer: @AwsCdkDsl CfnSegmentDefinition.() -> Unit = {},
): CfnSegmentDefinition = CfnSegmentDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSegmentDefinition(id: String, initializer: @AwsCdkDsl
    CfnSegmentDefinition.Builder.() -> Unit = {}): CfnSegmentDefinition =
    CfnSegmentDefinition.Builder.create(this, id).apply(initializer).build()
