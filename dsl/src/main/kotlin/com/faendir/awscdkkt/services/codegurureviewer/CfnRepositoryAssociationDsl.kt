@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codegurureviewer

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation
import software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps
import software.constructs.Construct

public fun Construct.cfnRepositoryAssociation(
  id: String,
  props: CfnRepositoryAssociationProps,
  initializer: CfnRepositoryAssociation.() -> Unit = {},
): CfnRepositoryAssociation = CfnRepositoryAssociation(this, id, props).apply(initializer)
