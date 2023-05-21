package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelPackageGroup(
  id: String,
  props: CfnModelPackageGroupProps,
  initializer: CfnModelPackageGroup.() -> Unit = {},
): CfnModelPackageGroup = CfnModelPackageGroup(this, id, props).apply(initializer)
