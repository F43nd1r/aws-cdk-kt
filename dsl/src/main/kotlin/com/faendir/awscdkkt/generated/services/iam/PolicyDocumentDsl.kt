package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.PolicyDocument

@Generated
public fun buildPolicyDocument(initializer: @AwsCdkDsl PolicyDocument.Builder.() -> Unit = {}): PolicyDocument = PolicyDocument.Builder.create().apply(initializer).build()
