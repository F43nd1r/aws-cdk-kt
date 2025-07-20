package com.faendir.awscdkkt.generated.services.codegurureviewer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation
import software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRepositoryAssociation(
  id: String,
  props: CfnRepositoryAssociationProps,
  initializer: @AwsCdkDsl CfnRepositoryAssociation.() -> Unit = {},
): CfnRepositoryAssociation = CfnRepositoryAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRepositoryAssociation(id: String, initializer: @AwsCdkDsl CfnRepositoryAssociation.Builder.() -> Unit = {}): CfnRepositoryAssociation = CfnRepositoryAssociation.Builder.create(this, id).apply(initializer).build()
