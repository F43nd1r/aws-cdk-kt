package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction
import software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps

@Generated
public fun elasticBeanstalkDeployAction(props: ElasticBeanstalkDeployActionProps):
    ElasticBeanstalkDeployAction = ElasticBeanstalkDeployAction(props)

@Generated
public fun buildElasticBeanstalkDeployAction(initializer: @AwsCdkDsl
    ElasticBeanstalkDeployAction.Builder.() -> Unit): ElasticBeanstalkDeployAction =
    ElasticBeanstalkDeployAction.Builder.create().apply(initializer).build()
