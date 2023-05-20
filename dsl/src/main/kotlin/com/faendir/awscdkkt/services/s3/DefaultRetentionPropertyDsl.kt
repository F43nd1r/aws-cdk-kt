@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

public
    fun defaultRetentionProperty(initializer: CfnBucket.DefaultRetentionProperty.Builder.() -> Unit):
    CfnBucket.DefaultRetentionProperty =
    CfnBucket.DefaultRetentionProperty.builder().apply(initializer).build()
