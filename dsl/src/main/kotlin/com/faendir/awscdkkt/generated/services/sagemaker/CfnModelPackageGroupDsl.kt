package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelPackageGroup(id: String, props: CfnModelPackageGroupProps):
    CfnModelPackageGroup = CfnModelPackageGroup(this, id, props)

@Generated
public fun Construct.cfnModelPackageGroup(
  id: String,
  props: CfnModelPackageGroupProps,
  initializer: @AwsCdkDsl CfnModelPackageGroup.() -> Unit,
): CfnModelPackageGroup = CfnModelPackageGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnModelPackageGroup(id: String, initializer: @AwsCdkDsl
    CfnModelPackageGroup.Builder.() -> Unit): CfnModelPackageGroup =
    CfnModelPackageGroup.Builder.create(this, id).apply(initializer).build()
