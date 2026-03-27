package com.faendir.awscdkkt.generated.services.cleanroomsml

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanroomsml.CfnConfiguredModelAlgorithmAssociation
import software.amazon.awscdk.services.cleanroomsml.CfnConfiguredModelAlgorithmAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfiguredModelAlgorithmAssociation(
  id: String,
  props: CfnConfiguredModelAlgorithmAssociationProps,
  initializer: @AwsCdkDsl CfnConfiguredModelAlgorithmAssociation.() -> Unit = {},
): CfnConfiguredModelAlgorithmAssociation = CfnConfiguredModelAlgorithmAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfiguredModelAlgorithmAssociation(id: String, initializer: @AwsCdkDsl CfnConfiguredModelAlgorithmAssociation.Builder.() -> Unit = {}): CfnConfiguredModelAlgorithmAssociation = CfnConfiguredModelAlgorithmAssociation.Builder.create(this, id).apply(initializer).build()
