package com.faendir.awscdkkt.generated.services.cleanroomsml

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanroomsml.CfnConfiguredModelAlgorithm
import software.amazon.awscdk.services.cleanroomsml.CfnConfiguredModelAlgorithmProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfiguredModelAlgorithm(
  id: String,
  props: CfnConfiguredModelAlgorithmProps,
  initializer: @AwsCdkDsl CfnConfiguredModelAlgorithm.() -> Unit = {},
): CfnConfiguredModelAlgorithm = CfnConfiguredModelAlgorithm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfiguredModelAlgorithm(id: String, initializer: @AwsCdkDsl CfnConfiguredModelAlgorithm.Builder.() -> Unit = {}): CfnConfiguredModelAlgorithm = CfnConfiguredModelAlgorithm.Builder.create(this, id).apply(initializer).build()
