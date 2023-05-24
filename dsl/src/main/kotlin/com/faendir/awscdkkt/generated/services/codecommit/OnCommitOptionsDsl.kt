package com.faendir.awscdkkt.generated.services.codecommit

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.OnCommitOptions

@Generated
public fun buildOnCommitOptions(initializer: @AwsCdkDsl OnCommitOptions.Builder.() -> Unit):
    OnCommitOptions = OnCommitOptions.Builder().apply(initializer).build()
